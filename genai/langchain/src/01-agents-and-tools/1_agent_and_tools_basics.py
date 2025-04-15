from dotenv import load_dotenv
import os
from langchain import hub

from rest_api_client import get_current_time_api

from langchain.agents import (
    AgentExecutor,
    create_react_agent,
)

from langchain_core.tools import Tool

from langchain_google_genai import ChatGoogleGenerativeAI



# Load environment variables from .env file
load_dotenv()

# Define a very simple tool function that returns the current time
def get_current_time(*args, **kwargs):
    """Returns the current time in H:MM AM/PM format."""
    data = get_current_time_api()  # Call the API function to get the current time data
    return data['value']
    # import datetime  # Import datetime module to get current time

    # now = datetime.datetime.now()  # Get current time
    # print("##Current time:", now)  # Print current time for debugging
    # return now.strftime("%I:%M %p")  # Format time in H:MM AM/PM format

tools = [
    Tool(
        name="Time",
        description="Useful for when you need to know the current time.",
        func=get_current_time,
    )
]

llm = ChatGoogleGenerativeAI(
    model="gemini-2.0-flash-001",
    temperature=0,
    max_tokens=None,
    timeout=None,
    max_retries=2,
    # other params...
)

# Pull the prompt template from the hub
# ReAct = Reason and Action
# https://smith.langchain.com/hub/hwchase17/react
prompt = hub.pull("hwchase17/react")

# Create the ReAct agent using the create_react_agent function
agent = create_react_agent(
    llm=llm,
    tools=tools,
    prompt=prompt,
    stop_sequence=True,
)

# Create an agent executor from the agent and tools
agent_executor = AgentExecutor.from_agent_and_tools(
    agent=agent,
    tools=tools,
    verbose=True,
)

# Run the agent with a test query
response = agent_executor.invoke({"input": "What time is it?"})

# Print the response from the agent
print("response:", response)

# print(get_current_time())