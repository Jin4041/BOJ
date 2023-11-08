len=int(input())
num=input().split()
find=input()
i=0
count=0
    
while i!=len:
    if num[i]==find:
        count+=1
    i+=1

print(count)