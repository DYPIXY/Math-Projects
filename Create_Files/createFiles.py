import random, string, os

class fil:

    def start():

        typeOfFile = ""
        message = ""
        nameOf = ""
        howMuch = int(input("how much files to write?: "))

        #if empty, create empty files, else, what mensage do you want? If empty no file extension, if message, is a txt        
        def FilePro():
            empty = input("do you want empty files? [y/n]: ")

            if empty.lower() in ["y", "yes"]:
                message = ""
                typeOfFile = ""
            elif empty.lower() in ["n", "no"]:
                message = input("which message do you want to write?: ")
                typeOfFile = ".txt"
            else:
                print("\n you put a wrong input, please write y or yes, n or no \n")
                FilePro()
        FilePro()


        #create a directory if it does not exists, remove everything inside if it already exists
        try:
            os.mkdir("FilesCreated")
        except OSError:
            print("")

        #chose the path to the files directory to create
        PATH = str(os.getcwd()+"/FilesCreated")
        os.chdir(PATH)

        #remove the files inside the folder if you created files in it before
        try:
            for files in os.listdir():
                os.remove(files)
        except ValueError:
            print("")

        #"random" names if True, else the input is the name
        name = input("'r' for files with a random name or type a name: ")            
        if name.lower() == "r":
            nameOf = "".join(random.choice(string.ascii_letters) for _ in range(6))
        else:
            nameOf = name

        #create files, separate name and number with underline
        for inter in range(howMuch):
                with open(nameOf + "_" + str(inter) + typeOfFile, "w+") as file:
                    file.write(str(message))
        
        file.close()
        print("\n end")
    
    start()