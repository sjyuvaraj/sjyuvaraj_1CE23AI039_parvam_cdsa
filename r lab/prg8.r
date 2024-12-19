str(airquality)
Temperature <- airquality$Temp
hist(Temperature)
hist(Temperature,
 main="Maximum daily temperature at La Guardia Airport",
 xlab="Temperature in degrees Fahrenheit",
 xlim=c(50,100),
 col="darkmagenta",
 freq=FALSE
)
hist(airquality$Temp,
 axes=FALSE,
 ann=FALSE,
 labels=TRUE,
 ylim=c(0,35),
 col=c("skyblue","chocolate"))
hist(airquality$Temp,prob=TRUE)
lines(density(airquality$Temp),col="green")