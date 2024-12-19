library(ggplot2s)
set.seed(123) # for reproducibility
years_of_experience <- 0:20
years_of_experience
salary <- 30000 + 1500 * years_of_experience + rnorm(length(years_of_experience), mean = 0, sd = 1000)
data <- data.frame(Years_of_Experience = years_of_experience, Salary = salary)
salary
model <- lm(Salary ~ Years_of_Experience, data = data)
predicted_salaries <- predict(model)
ggplot(data, aes(x = Years_of_Experience, y = Salary)) +
 geom_point(color = "blue") +
 geom_line(aes(y = predicted_salaries), color = "red") +
 labs(title = "Actual vs Predicted Salary",
Data Analytics with R(BDS306C)
Dept. of AI & ML page:34
 x = "Years of Experience",
 y = "Salary") +
 theme_minimal()
ggplot(data, aes(x = Salary, y = predicted_salaries)) +
 geom_point(color = "blue") +
 geom_abline(intercept = 0, slope = 1, color = "red", linetype = "dashed") +
 labs(title = "Actual vs Predicted Values",
 x = "Actual Salary",
 y = "Predicted Salary") +
 theme_minimal()
slope <- coef(model)[2]
intercept <- coef(model)[1]
cat("Slope:", slope, "\n")
cat("Intercept:", intercept, "\n")
ggsave("actual_vs_predicted_salary_plot.png", plot = last_plot())
ggsave("actual_vs_predicted_values_plot.png", plot = last_plot())
write.table(coef(model), file = "coefficients.txt")
data$Predicted_Salary <- predicted_salaries
write.csv(data, file = "updated_dataset.csv", row.names = FALSE)