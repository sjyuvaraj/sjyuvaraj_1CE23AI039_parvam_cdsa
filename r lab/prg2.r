df<-read.csv("R2 Data.csv")
df
profit<- df$MonthlyRevenue - df$MonthlyExpenses
profit
ProfitAfterTax<- profit - profit *0.3
ProfitAfterTax
ProfitMargin<- round(ProfitAfterTax / df$MonthlyRevenue, 2) * 100
ProfitMargin
mean_year_ProfitAfterTax<-mean(ProfitAfterTax)
mean_year_ProfitAfterTax
mean function as mean(x/n)) (5 points)
ProfitAfterTax_gt_year_mean <- NULL
x<-1
i<-0
for(i in seq(along=ProfitAfterTax)) {
 if(ProfitAfterTax[i] > mean_year_ProfitAfterTax) {
 ProfitAfterTax_gt_year_mean[x] <- i
 x<-x+1
 }
}
print("Goods Months with profit after tax was greater than the mean for the year:Months represented by a
number")
print(ProfitAfterTax_gt_year_mean)
Data Analytics with R(BDS306C)
Dept. of AI & ML page:27
ProfitAfterTax_lessthan_year_mean <- NULL
x<-1
i<-0
for(i in seq(along=ProfitAfterTax)) {
 if(ProfitAfterTax[i] < mean_year_ProfitAfterTax) {
 ProfitAfterTax_lessthan_year_mean[x] <- i
 x<-x+1
 }
}
print("Bad Months with profit after tax was lesser than the mean for the year: Months represented by a
number")
print(ProfitAfterTax_lessthan_year_mean)
best_month<-which(ProfitAfterTax==max(ProfitAfterTax))
cat("Best Month : ",best_month)
worst_month<-which(ProfitAfterTax==min(ProfitAfterTax))
cat("Worst Month : ",worst_month)