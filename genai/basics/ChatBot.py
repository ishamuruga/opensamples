import streamlit as st
from PyPDF2 import PdfReader
from langchain.text_splitter import RecursiveCharacterTextSplitter
from langchain.embeddings.openai import OpenAIEmbeddings
from langchain.vectorstores import FAISS
from langchain.chains.question_answering import load_qa_chain
from langchain_community.chat_models import ChatOpenAI  

# https://platform.openai.com/api-keys


OPENAI_API_KEY = "super text"
 

#Upload PDF Files
st.header("My Chat Bot")

with st.sidebar:
    st.title("Your Documents")
    st.button("Click")
    file = st.file_uploader("Upload PDF Files and Start asking questions",type="pdf")

# Extract the text

if file is not None:
    pdf_reader = PdfReader(file)
    text=""
    for page in pdf_reader.pages:
        text += page.extract_text()
        # st.write(text)

# Break it to Chunks
    text_splitter = RecursiveCharacterTextSplitter(
        separators="\n",
        chunk_size=1000,
        chunk_overlap=150,
        length_function=len
    )

    chunks = text_splitter.split_text(text)
    # st.write(chunks)

# Generating the Embeddings

    embeddings = OpenAIEmbeddings(openai_api_key=OPENAI_API_KEY)

# Creating the Vector Store - Facebook ai semantic search
    vector_store = FAISS.from_texts(chunks,embeddings)

    user_question = st.text_input("Type your question her   e")

    if user_question:
        match=vector_store.similarity_search(user_question)
        st.write(match)
        llm = ChatOpenAI(
            openai_api_key = OPENAI_API_KEY,
            temperature = 0,
            max_tokens = 1000,
            model_name = "gpt-3.5-turbo"
        )
        chain = load_qa_chain(llm,chain_type="stuff")
        response = chain.run(input_documents=match,question=user_question)
        st.write(response)