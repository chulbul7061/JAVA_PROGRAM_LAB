//import non_static_innerclass.Biscuits;

class non_static_innerclass
 {
    int x=5;
    class Biscuits{
        public void show_x()
        {
            System.out.println("this is inner class b"+x);
        }
    }
}

class Test
{
    public static void main(String args[])
    {
        non_static_innerclass obj=new non_static_innerclass();
        non_static_innerclass.Biscuits obj2=obj.new Biscuits();
        obj2.show_x();
        
    }
}
