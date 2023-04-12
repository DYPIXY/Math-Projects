class test:
    def __init__(self, var, var2, var3):
        self.s1 = var+var2+var3
        self.s2 = var-var2-var3
        self.s3 = var*var2*var3

fodeu = test(3,2,1)
print(fodeu.s1, fodeu.s2, fodeu.s3)
