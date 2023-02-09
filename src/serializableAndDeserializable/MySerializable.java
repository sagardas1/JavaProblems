package serializableAndDeserializable;

import java.io.*;

public  class MySerializable implements Serializable {
int x=0;
int j=0;


}
class child extends MySerializable{

    int i=0;
    int j=0;


//    public child(int x,int j)  {
//      j= super.j;
//      x=super.x;
//      i=10;
//      j=10;
//
//    }

    private void writeObject(ObjectOutputStream out) throws IOException
    {
        throw new NotSerializableException();
    }
}

class main{
    public static void main(String[] args) throws IOException {


        child mySerializable = new child();
        mySerializable.j=0;
        mySerializable.x=0;

        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);



        objectOutputStream.writeObject(mySerializable);
    }
}