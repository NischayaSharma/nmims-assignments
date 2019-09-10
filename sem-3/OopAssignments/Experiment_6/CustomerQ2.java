class CustomerQ2{
    private int customerId, total=0;
    public void setCustomerId(int id){
        this.customerId = 1000 + (++total);
    }
    public int getCustomerId(){
        return this.customerId;
    }
}