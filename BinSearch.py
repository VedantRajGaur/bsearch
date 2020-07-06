def bSearch(): 
   arr=[]
   n = int(input("Enter number of elements:"))
   print("Enter the elements in the array:")
   for i in range(0, n): 
       num=int(input()) 
       arr.append(num)
   x=int(input("Enter the element to be Searched:"))
   high=len(arr)
   low=0
   mid=0
   while high>=low:
    mid=low+(high-low)//2
    if arr[mid]==x:
      return mid
    elif arr[mid]>x:
      high=mid-1
    else:
      low=mid+1
   return -1

ans=bSearch()
if ans!=-1:
  print("Element is present at position",str(ans+1))
else:
  print("Element is not present in the array")
