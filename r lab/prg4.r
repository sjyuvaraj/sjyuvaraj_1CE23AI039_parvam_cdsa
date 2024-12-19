recur_fact <- function(num) {
 if(num <= 1) {
 return(1)
 } else {
 return(num * recur_fact(num-1))
 }
}
print(paste("The factorial of 5 is",recur_fact (5)))
