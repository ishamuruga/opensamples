import requests

# Base URL of the API
BASE_URL = "http://127.0.0.1:8080/api"

# GET all users
def get_current_time_api():
    response = requests.get(f"{BASE_URL}/time/current")
    if response.status_code == 200:
       return response.json()
    else:
        print("Failed to get users:", response.status_code)

def get_all_users():
    response = requests.get(f"{BASE_URL}/users")
    if response.status_code == 200:
        print("All users:", response.json())
    else:
        print("Failed to get users:", response.status_code)

# GET a single user by ID
def get_user_by_id(user_id):
    response = requests.get(f"{BASE_URL}/users/{user_id}")
    if response.status_code == 200:
        print(f"User {user_id}:", response.json())
    else:
        print(f"User {user_id} not found:", response.status_code)