X<- c(2, 5, 18, 1, 12)
cat('Using Subscript operator', X[2], '\n')
Y<- c(4, 8, 2, 1, 17)
cat('Using combine() function', Y[c(4, 1)], '\n')
X<- c(2, 7, 9, 7, 8, 2)
X[3] <- 1
X[2] <-9
cat('subscript operator', X, '\n')
X[1:5]<- 0
cat('Logical indexing', X, '\n')
X<- X[c(3, 2, 1)]
cat('combine() function', X)
M<- c(8, 10, 2, 5)
M<- NULL
cat('Output vector', M)
X<- c(8, 2, 7, 1, 11, 2)
A<- sort(X)
cat('ascending order', A, '\n')
B<- sort(X, decreasing = TRUE)
cat('descending order', B)
A = matrix(
 c(1, 2, 3, 4, 5, 6, 7, 8, 9),
 nrow = 3,
 ncol = 3,
Data Analytics with R(BDS306C)
Dept. of AI & ML page:22
 byrow = TRUE
)
cat("The 3x3 matrix:\n")
print(A)
cat("Accessing first and second row\n")
print(A[1:2, ])
A = matrix(
 c(1, 2, 3, 4, 5, 6, 7, 8, 9),
 nrow = 3,
 ncol = 3,
 byrow = TRUE
)
cat("The 3x3 matrix:\n")
print(A)
cat("Accessing first and second column\n")
print(A[, 1:2])
A = matrix(
 c(1, 2, 3, 4, 5, 6, 7, 8, 9),
 nrow = 3,
 ncol = 3,
 byrow = TRUE
)
cat("The 3x3 matrix:\n")
print(A)
print(A[1, 2])
print(A[2, 3])
A = matrix(
 c(1, 2, 3, 4, 5, 6, 7, 8, 9),
 nrow = 3,
 ncol = 3,
 byrow = TRUE
)
cat("The 3x3 matrix:\n")
print(A)
cat("Accessing the first three rows and the first two columns\n")
print(A[1:3, 1:2])
A = matrix(
 c(1, 2, 3, 4, 5, 6, 7, 8, 9),
 nrow = 3,
 ncol = 3,
 byrow = TRUE
)
cat("The 3x3 matrix:\n")
print(A)
A[3, 3] = 30
cat("After edited the matrix\n")
print(A)
A = matrix(
 c(1, 2, 3, 4, 5, 6, 7, 8, 9),
 nrow = 3,
 ncol = 3,
 byrow = TRUE
)
cat("The 3x3 matrix:\n")
print(A)
B = matrix(
 c(10, 11, 12),
 nrow = 1,
 ncol = 3
)
cat("The 1x3 matrix:\n")
print(B)
C = rbind(A, B)
cat("After concatenation of a row:\n")
print(C)
A = matrix(
 c(1, 2, 3, 4, 5, 6, 7, 8, 9),
 nrow = 3,
 ncol = 3,
 byrow = TRUE
)
cat("The 3x3 matrix:\n")
print(A)
B = matrix(
 c(10, 11, 12),
 nrow = 3,
 ncol = 1,
 byrow = TRUE
)
cat("The 3x1 matrix:\n")
print(B)
C = cbind(A, B)
cat("After concatenation of a column:\n")
print(C)
A = matrix(
 c(1, 2, 3, 4, 5, 6, 7, 8, 9),
 nrow = 3,
 ncol = 3,
 byrow = TRUE
)
cat("Before deleting the 2nd row\n")
print(A)
A = A[-2, ]
cat("After deleted the 2nd row\n")
print(A)
A = matrix(
 c(1, 2, 3, 4, 5, 6, 7, 8, 9),
 nrow = 3,
 ncol = 3,
 byrow = TRUE
)
cat("Before deleting the 2nd column\n")
print(A)
A = A[, -2]
cat("After deleted the 2nd column\n")
print(A)