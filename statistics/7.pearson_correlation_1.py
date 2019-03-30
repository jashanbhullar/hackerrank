import statistics as st
n , X, Y = int(input()) , list(map(float,input().split())), list(map(float , input().split()))
ux , ox = st.mean(X) , st.pstdev(X)
uy , oy = st.mean(Y) , st.pstdev(Y)
print(round(sum([(x-ux)*(y-uy) for x,y in zip(X,Y)])/(n*ox*oy),3))
