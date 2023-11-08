hour, min=input().split()
time=int(input())

hour=int(hour)     
min=int(min)

if min+time>=60:
    newMin=(min+time)%60
    hour=hour+(min+time)//60
    if hour>23:
        hour=hour-24
else:
    newMin=min+time

print("%d %d" %(hour,newMin))
