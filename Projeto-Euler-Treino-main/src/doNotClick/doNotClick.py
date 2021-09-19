import webbrowser
import os
import time
pathx=os.path.dirname(__file__)
os.chdir(pathx)

print("welcome to the rice fields")
time.sleep(4)
while True:
    webbrowser.open("Shrek_2.pdf")