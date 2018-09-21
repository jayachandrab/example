class Address
{
   int streetNum;
   String city;
   String state;
   String country;
   Address(int street, String c, String st, String coun)
   {
       this.streetNum=street;
       this.city =c;
       this.state = st;
       this.country = coun;
   }
}

class College
{
   String collegeName;
   //Creating HAS-A relationship with Address class
   Address collegeAddr; 
   College(String name, Address addr){
       this.collegeName = name;
       this.collegeAddr = addr;
   }


  
}
