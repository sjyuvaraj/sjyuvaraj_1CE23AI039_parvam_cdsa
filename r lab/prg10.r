data(mtcars)
library(e1071)
observations <- nrow(mtcars)
variables <- ncol(mtcars)
cat("Total number of observations:", observations, "\n")
cat("Total number of variables:", variables, "\n\n")
car_max_hp <- mtcars[which.max(mtcars$hp), ]
car_min_hp <- mtcars[which.min(mtcars$hp), ]
cat("Car with the largest hp:", rownames(mtcars)[which.max(mtcars$hp)], "\n")
cat("Car with the least hp:", rownames(mtcars)[which.min(mtcars$hp)], "\n\n")
 par(mfrow=c(3, 4)) # Arrange plots in a grid
for (i in 1:variables) {
 hist(mtcars[,i], main=names(mtcars)[i], xlab="", col="skyblue")
 lines(density(mtcars[,i]), col="red")
 cat("Skewness of", names(mtcars)[i], ":", skewness(mtcars[,i]), "\n")
}
hp_diff_mean <- mean(abs(mtcars$hp[mtcars$cyl == 3] - mtcars$hp[mtcars$cyl == 4]))
hp_diff_sd <- sd(mtcars$hp[mtcars$cyl == 3]) - sd(mtcars$hp[mtcars$cyl == 4])
cat("Average difference of hp between 3 and 4 cylinders:", hp_diff_mean, "\n")
cat("Difference in their standard deviations:", hp_diff_sd, "\n\n")
cor_matrix <- cor(mtcars)
cor_matrix[upper.tri(cor_matrix)] <- NA 
max_corr <- max(cor_matrix, na.rm=TRUE)
max_corr_index <- which(cor_matrix == max_corr, arr.ind=TRUE)
max_corr_index
cat("Pair of variables with the highest Pearson correlation:", rownames(cor_matrix)[max_corr_index[1]],"and", colnames(cor_matrix)[max_corr_index[2]], "with correlation", max_corr, "\n")
cor_matrix <- cor(mtcars)
diag(cor_matrix) <- 
max_correlation <- max(cor_matrix)
variable_names <- colnames(mtcars)
row <- which(cor_matrix == max_correlation, arr.ind = TRUE)[1]
col <- which(cor_matrix == max_correlation, arr.ind = TRUE)[2]
cat("Pair of variables with the highest Pearson correlation:", variable_names[row], "and",variable_names[col], "(", max_correlation, ")\n")
cat("Pair of variables with the highest Pearson correlation:", rownames(cor_matrix)[max_corr_index[1]],"and", colnames(cor_matrix)[max_corr_index[2]], "with correlation", max_corr, "\n")