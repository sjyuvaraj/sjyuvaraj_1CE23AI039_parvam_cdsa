m1= matrix(c(1, 2, 3, 4, 5, 6,7,8,9), nrow = 3,ncol=3,byrow=TRUE)
print("Matrix-1:")
print(m1)
m2 = matrix(c(10,11,12,13,14,15,16,17,18), nrow = 3,ncol=3,byrow=TRUE)
print("Matrix-2:")
print(m2)
result = m1 + m2
print("Result of addition")
print(result)
result = m1 - m2
print("Result of subtraction")
print(result)
result = m1 * m2
print("Result of multiplication")
print(result)
trans=t(m1)
print("The transpose of a matrix is:")
print(t(m1))