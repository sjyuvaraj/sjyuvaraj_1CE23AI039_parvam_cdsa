a <- c (1, 0.1)
b <- c (2.33, 4)
print (a+b)
print(b-a)
print(a*b)
c<-10
d<-5
print(c/d)
print(c%/%d)
f<-4
g<-2
print(f^g)
list1<- c(2, 22)
list2<-c(2,4)
print(list1 %% list2)
vec1 <- c(0, 2)
vec2 <- c(2, 3)
cat ("Addition of vectors :", vec1 + vec2, "\n")
cat ("Subtraction of vectors :", vec1 - vec2, "\n")
cat ("Multiplication of vectors :", vec1 * vec2, "\n")
Data Analytics with R(BDS306C)
Dept. of AI & ML page:15
cat ("Division of vectors :", vec1 / vec2, "\n")
cat ("Modulo of vectors :", vec1 %% vec2, "\n")
cat ("Power operator :", vec1 ^ vec2)
list1 <- c(TRUE, 0.1)
list2 <- c(0,4+3i)
print(list1 & list2)
list1 <- c(TRUE, 0.1)
list2 <- c(0,4+3i)
print(list1 && list2)
list1 <- c(TRUE, 0.1)
list2 <- c(0,4+3i)
print(list1||list2)
vec1 <- c(0,2)
vec2 <- c(TRUE,FALSE)
cat ("Element wise AND :", vec1 & vec2, "\n")
cat ("Element wise OR :", vec1 | vec2, "\n")
cat ("Logical AND :", vec1 && vec2, "\n")
cat ("Logical OR :", vec1 || vec2, "\n")
cat ("Negation :", !vec1) 