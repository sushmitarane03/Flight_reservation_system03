public com.upgrade.ims;
public class BusinessPartner{
    private static id Counter;
    private int id;
    private static class Address{
        String street,city,state;
        public Address{String street,string city,string state){
            this.street = street;
            this.city = city;
            this.state = state;
        }
            public string getAddressDetails(){
                return street + "," + city + "," + state;
            }
            private Address address;
            private static class contact{
                String phone,name,email;
                public contact(String name,String phone,String email){
                    this.name = name;
                    this.phone = phone;
                    this.email = email;
                }
            }
            private Contact contact;
            static {
                id counter = 0;
            }
            public Business Partner(String addressStreet, String addressCity, String addressState,String contactName,String contactPhone,String contactEmail){
                this.id = ++idCounter;
                this.address = new Address(addressStreet,addressCity,addressState);
                this.contact = new Contact(contactName,contactPhone,contactEmail);
            }
            public int getId(){return this.id;}
            public String getAddressDetails(){
                return address.street + ","+ address.city +"," + address.state;
            }
            public String getContactDetails(){
                return contact.name +"," + contact.phone + "," + contact.email;
            }
        }


