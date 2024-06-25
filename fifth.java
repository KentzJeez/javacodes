public abstract Clock
{
    private String Model;
    private String Type;
    public double Price;


    public clock(String Model,String Type,double Price)
    {
        this.Model=model;
        this.Type=type;
        this.Price=price;
    }//constructorrrr

    public String getModel(){
        return Model;
    }//gettterrr
    public String getType()
    {
        return Type;
    }//getterrrrr

    public abstract String getWatchDetails();
    public String printDetails()
    {
        return Model.toUpperCase()+""+Type.toUpperCase();
    }

    public class Movement
    {
        public int NumberOfGears;
        public float WaterResistLevel;


        public Movement(int NumberOfGears,float WaterResistLevel)
        {
            this.NumberOfGears=NumberOfGears;
            this.WaterResistLevel=WaterResistLevel;
        }
    }
}