//オブジェクト指向のgetter/setterの使い方

//getter/setterメソッドの使用例
class User{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

//getter/setterメソッドはコードが冗長になってしまうという欠点も存在
class User{
    private String name;
    private int age;
    private boolean isAdmin;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean getAdmin(){
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin){
        this.isAdmin = isAdmin;
    }
}

//PI(Persistence Ignorance)は、「ただの構造体として振る舞う」クラスのパターン。POJO(Plain old java object)とも呼ばれる。
//このパターンを用いると、上記のJavaコードは次のように書き換えられる。
class User{
    public String name;
    public int age;
    public boolean isAdmin;
}

//Ruby on RailsやLaravel等のActiveRecordでは、コード上では定義されていないフィールドに動的にアクセスすることができる。
class User extends Model{

}

$user = User::first();
$user->id;
$user->name;

//といったようにアクセスでき、当然こういった場合はgetter/setterメソッドをいちいち定義する必要はない。


//java try-catch文
//基本構造

//tryブロックでは例外が発生しうる処理を書きます。もしtryブロック内で例外が発生したなら、Javaがその例外を捕まえて、catchブロックに処理を移します。catchブロック内には補足した例外への処理を書いておきます。
try{
    //例外が発生しうる処理
}catch(/* 捕まえる例外の型　例外の変数 */){
    //例外発生時の処理
}

public FileReader(String fileName) throw FileNotFoundEXCEPTION

try{
    FileReader fr = new FileReader("/A/B/C/D.txt") //ここで発生しうるFileNotFoundExceptionを...
}catch(FileNotFoundEXCEPTION e){ /// ここでcatchして…
    System.out.println("ファイルがありません！！"); //// 何かのフォロー処理を行う!!
}
//ここでのeはexceptionのe


//例外が発生すると処理は中断される
//以下のプログラムでは、処理の実行順序は①→②→④→⑤となり、③は実行されません。例外が途中で発生しなければ①→②→③→⑤となり、catchブロックの内容(④)は実行されない
System.out.println("①");

try{
    System.out.println("②");
    if (true){// ※if文はコンパイルエラーを回避するためで、実際には不要
        throw new Exception(); // 例外が発生!!
    }
    System.out.println("③");
}catch(Exception e){
    System.out.println("④");
}
System.out.println("⑤");


//finallyで必ず実行する処理を記述する方法
//ここではfinallyの使い方を解説します。finallyブロックの中の処理は、例外の有無に関わらず、最後に必ず実行されます。そのため、finallyはファイルを開いた後に確実にcloseメソッドで閉じたいときなどに使用される。

import java.io.File;
import java.io.FileReader;
import java.io.IOException; //

public class Main{

    public static void main(String[] args){
        //1.ファイルのパスを指定する.
        File file = new File("c:\\Sample\\Test.txt");

        //2.ファイルが存在しない時び例外が発生するので確認する.
        if(!file.exist()){
            System.out.println("ファイルがぞんざいしません");
            return;
        }

        //3.FileReaderクラスとreadメソッドを使って1文字ずつ読み込み表示する
        FileReader fileReader = null;
        try{
            fileReader = new FileReader(file);

            int data;
            while((data = fileReader.read() != -1)){
                System.out.print((char) data);
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            //4.最後にファイルを閉じてリソースを確認する
        }try{
            if(fileReader != null){
                fileReader.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

//表示結果　SAMURAI　ENGINEER


