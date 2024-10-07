import requests
import numpy as np
import faiss

d=4096

titles = [
    "The only way to do great work is to love what you do. – Steve Jobs",
    "In the end, we will remember not the words of our enemies, but the silence of our friends. – Martin Luther King Jr.",
    "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill",
    "You miss 100% of the shots you don't take. – Wayne Gretzky",
    "The future belongs to those who believe in the beauty of their dreams. – Eleanor Roosevelt",
    "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. – Ralph Waldo Emerson",
    "Life is what happens when you're busy making other plans. – John Lennon",
    "It does not matter how slowly you go as long as you do not stop. – Confucius",
    "The journey of a thousand miles begins with one step. – Lao Tzu",
    "Happiness is not something ready-made. It comes from your own actions. – Dalai Lama",
    "Where there is love there is life. – Mahatma Gandhi",
    "Love all, trust a few, do wrong to none. – William Shakespeare",
    "You know you're in love when you can't fall asleep because reality is finally better than your dreams. – Dr. Seuss",
    "The best thing to hold onto in life is each other. – Audrey Hepburn",
    "Love takes off the masks that we fear we cannot live without and know we cannot live within. – James Baldwin"
]

index = faiss.IndexFlatL2(d)

X= np.zeros((len(titles),d),dtype='float32')

for i, title in enumerate(titles):


    res = requests.post("http://localhost:11434/api/embeddings",
                    json={
                        "model":"mistral",
                        "prompt" :title
                    })
    embedding = res.json()["embedding"]
    X[i]=np.array(embedding)
    # print(res.json()["embedding"])
    # print(len(res.json()["embedding"]))


index.add(X)

new_prompt = "define tehe relationship between love and life"
res = requests.post("http://localhost:11434/api/embeddings",
                json={
                    "model":"mistral",
                    "prompt" :new_prompt
                })
new_prompt_response = np.array([res.json()["embedding"]],dtype="float32")

D, I = index.search(new_prompt_response,5)

print(np.array(title)[I.flatten()])