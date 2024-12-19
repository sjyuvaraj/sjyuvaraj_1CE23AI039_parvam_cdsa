A = matrix(
 c(1, 2, 3, 4, 5, 6, 7, 8, 9),
 nrow = 3,
 ncol = 3,
 byrow = TRUE
)
rownames(A) = c("a", "b", "c")
colnames(A) = c("c", "d", "e")
cat("The 3x3 matrix:\n")
print(A)
print(matrix(5, 3, 3))
print(diag(c(5, 3, 3), 3, 3))
print(diag(1, 3, 3)) 
A = matrix(
 c(1, 2, 3, 4, 5, 6, 7, 8, 9),
 nrow = 3,
 ncol = 3,
 byrow = TRUE
)
cat("The 3x3 matrix:\n")
print(A)
cat("Dimension of the matrix:\n")
print(dim(A))
cat("Number of rows:\n")
print(nrow(A))
cat("Number of columns:\n")
print(ncol(A))
cat("Number of elements:\n")
print(length(A))
print(prod(dim(A)))