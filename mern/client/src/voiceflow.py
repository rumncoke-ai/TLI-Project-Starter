import requests
import json

api_key = "VF.DM.633d7b31b060e40007430b0c.lfS7X2d9pEZS4oc1"

user_id = "test_user"
user_input = "Hi, can I have some help?"

body = {"action": {"type": "text", "payload": "Hello world!"}}

# Start a conversation
response = requests.post(
    f"https://general-runtime.voiceflow.com/state/user/{user_id}/interact",
    json=body,
    headers={"Authorization": api_key},
)

# Log the response
print(response.json())

json_str = json.dumps(response.json())

print(json_str)

with open("sample.json", "w") as outfile:
    outfile.write(json_str)
