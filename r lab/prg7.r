Itemcode=c(1001,1002,1003,1004,1005)
ItemCatagory=c("Electronics", "Desktop Supplies", "Office Supplies", "USB", "CD Drives")
ItemPrice=c(700,300,350,400,800)
ItemQty=c(100,200,300,250,150)
ItemReorder=c(50,20,30,60,100)
Item=data.frame(Itemcode,ItemCatagory,ItemPrice)
Item
subset(Item,ItemPrice>350)
subset(Item, ItemCatagory == 'Desktop Supplies' | ItemCatagory == 'Office Supplies')
ItemDetails=data.frame(Itemcode,ItemQty,ItemReorder)
ItemDetails
combined<-merge(x=Item, y=ItemDetails, by="Itemcode")
combined