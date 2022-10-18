--Select
--ANSII

Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

Select * from Customers where City = 'Berlin'

--case inSenSitivE
seLeCt * from Products where CategoryID =1 or CategoryID=3

seLeCt * from Products where CategoryID =1 and UnitPrice>=10

--Order by = sırala

select * from Products where CategoryID=1 order by UnitPrice desc   ---ascending(artan) ---descending(azalan)

--Group by = 
select COUNT(*) Adet from Products where CategoryID=2

Select CategoryID, COUNT(*) Adet from Products where UnitPrice>20 Group by CategoryID having count(*)<10

Select COUNT(*) Adet from Products Group by CategoryID

--Joinler
Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10


Select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null