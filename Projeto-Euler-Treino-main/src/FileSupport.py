import time
import os
import math


print("Hello",os.getlogin())

#everything outside the ~start function~ just need to be executed one time

#change the current working directory

path = os.path.dirname(__file__)+"/Project_java"   
os.chdir(path)
print('')


#pre compile the files 

def Compile():
    altPath = path+"/Project_class"
    #javac path/Project_java/* -d path/Project_class/
    javac = "javac "+path+"/* -d "+altPath
    os.system(javac)   


#check if the user wants to compile

useCompiled = False
com = input("Do you want to compile the files? [y/n]:").lower()
if com == "y":
    Compile()
    useCompiled = True


def start():    
    #reset the program 
    def reset():
        reset1 = input("want to run it again? [y/n]: ").lower()
        if reset1 == "y":
            start()
        elif reset1 == "n":
            print("")
            print("ok, closing, goodbye!")
            print("")
            quit()
        else:
            print("that's not a valid input, please try again")
            reset()

    #list all files in directory that starts with "Project"
    ListFiles = []
    for fi in os.listdir(path): 
        if fi.startswith("Project"):
            ListFiles.append(fi)
    ListFiles.sort()  
    print(ListFiles)

    #user input
    def keyboard():
        
        a = input("Select the number that represents one of the projects you want to run: ").lower()
        #shrek 2 
        if a == "shrek2" or a == "Shrek2":
            pathx = os.path.dirname(__file__)
            path = str(pathx+"/doNotClick")
            os.chdir(path)
            os.system("python doNotClick.py")
            quit()
        
        #check if ~a~ is an int
        x = type(a)
        x = str(x)
        try:
            a=int(a)
        except ValueError:
            print("critical error, you put a "+x+" you have to put an integer.")
            reset()
        
        #this is made to validate "1", "01" or "001" that come from the user    
        #if length invalid, restart the ~keyboard()~
        a = str(a)
        if len(a) == 1:
            a = str('00'+a)
        elif len(a)==2:
            a= str('0'+a)
        if len(a)!= 3:
            print("invalid key, please select a valid integer")
            keyboard()
        a = str(a)
        return a

    
    #create a string that will initiate the java Project
    NumOfExec = keyboard() 
    FileToExec = str('Project'+NumOfExec)
    ExecWay = str('java '+FileToExec+'.java')

    #i had the idea of remake the project euler but in python and c or c++, but
    #i desist to do that in other languages because i prefer to do other projects than stuck with just one,
    #and i already know the answer, so i don't think this will be good 
    
    print("")
    print("May this take a little bit time, so be patient(but it'll never pass 60 seconds)")
    print("")
    exectime = time.time()
    os.system(ExecWay)
    print( "Executed in ≅",time.time() - exectime,'seconds')
    print("")
    
    reset()
    
    #end of ~start()~
    

#this call the function of ~def start()~ to make all the interactions above     
start()
