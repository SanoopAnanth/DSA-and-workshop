def prime(n):
    flag=False
    if n>1:
        for i in range(2,n//2):
            if n%i==0:
                print("Number is not a prime number")
                exit(0)
        print("Number is a prime number")
    else:
        print("Number not a prime number")
x=prime(int(input("Enter the number: ")))