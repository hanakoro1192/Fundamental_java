// import sun.net.www.content.audio.x_aiff;

// //オブジェクト指向のgetter/setterの使い方

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

// //getter/setterメソッドはコードが冗長になってしまうという欠点も存在
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
//     }
// }

// //PI(Persistence Ignorance)は、「ただの構造体として振る舞う」クラスのパターン。POJO(Plain old java object)とも呼ばれる。
// //このパターンを用いると、上記のJavaコードは次のように書き換えられる。
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

// 表示結果　SAMURAI　ENGINEER


// java継承
// 親クラス←小クラス

// EXIT_ON_CLOSE (WindowConstantsで定義されています): System exitメソッドを使用してアプリケーションを終了します。 アプリケーションでのみ使用する。

// setBounds:フレームのサイズを設定する

// import javax.swing.JFrame;

class Fundamental{
    public static void main(String[] args){
        JFrame frame1 = new JFrame("My Title1");
        frame1.setBounds(100, 100, 600, 400);
        frame1.setVisible(true);

        JFrame frame2 = new JFrame("My Title2");
        frame2.setBounds(100, 100, 600, 400);
        frame2.setVisible(true);
    }
}

public class Fundamental {
    public static void main(String args[]){
        //変数
        //型　変数名
        // String msg;
        // msg = "Hello world";
        String msg = "Hello world";

        System.out.println(msg);
    }
}


public class Fundamental {
    public static void main(String args[]){
        //文字
        char a = 'a';

        //正数 byte short int long
        int x = 10;
        long y = 555555L;

        //浮動小数点数float double
        double d = 23423.5555;
        float f = 32.33F;

        //論理演算
        boolean flag = true; //false

        //文字列
        String msg = "Hel\nlo worl\td";

        // \n 改行
        // \t　タブ
        System.out.println(msg);
    }
}

public class Fundamental{
    public static void main(String args[]){
        //演算
        // + - / %
        // ++ --
        int i;
        i = 10 / 3;
        System.out.println(i); //3
        i = 10 % 3;
        System.out.println(i); //1
        int x =  5;
        x++;
        System.out.println(x); //6

        // int y = 5;
        // // x = x + 12;
        // y += 12;
        // System.out.println(x);

        //文字列の連結
        String s;
        s = "hello " + "world";
        System.out.println(s);
    }
}



public class Fundamental{
    public static void main(String args[]){
        //キャスト
        double d = 52343.231;
        int i =(int)d;   //int型に変換
        System.out.println(i);

        int i = 10;
        double d = (double)i / 4;
        System.out.println(d);
    }
}

public class Fundamental{
    public static void main(String[] args){

        int score = 90;
        // if(score > 80){
        //     System.out.println("Great");    
        // }else if(score > 60){
        //     System.out.println("good"); 
        // }
        // else{
        //     System.out.println("soso"); 
        // }
        String msg = score > 80 ? "Great" : "soso";
        System.out.println(msg); 
    }
}

public class Fundamental{
    public static void main(String[] args){
        //switch
        String signal = "green";
        switch(signal){
            case "red":
                System.out.println("Stop!"); 
                break;
            case "blue":
            case "green":
                System.out.println("go!"); 
                break;
            case "yellow":
                System.out.println("caution!"); 
                break;
            default:
                System.out.println("wrong signal!"); 
                break;
        }
    }
}

public class Fundamental{
    public static void main(String[] args){
    //while
    //0-9
    int i = 0;
    // while(i < 10){
    //     System.out.println(i); 
    //     i++;
    //     }
    do{
        System.out.println(i); 
        i++;
    }while(i < 10);
    }
}

public class Fundamental{
    public static void main(String[] args){
        //for
        //0 - 9
        //break
        //continue
        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i); 
        }
    }
}

public class Fundamental{
    public static void main(String[] args){
    //配列
    //sales1, sales2,....
    //sales

    // int[] sales;
    // sales = new int[3];

    // sales[0] = 100;
    // sales[1] = 200;
    // sales[2] = 300;

    // int[] sales;
    // sales = new int[] {100, 200, 300};

    int[] sales = {100, 200, 300};

        System.out.println(sales[1]); 

        sales[1] = 1000;
        System.out.println(sales[1]); 
    }
}

public class Fundamental{
    public static void main(String[] args){
        // int x = 10;
        // int y = x;
        // y = 5;
        // System.out.println(x); 
        // System.out.println(y); 

        // int[] a = {3, 5, 7};
        // int[] b = a;
        // b[1] = 8;
        // System.out.println(a[1]); 
        // System.out.println(b[1]); 

        String s = "hello";
        String t = s;
        t = "world";
        System.out.println(s); 
        System.out.println(t); 
    }
}

public class Fundamental{

    //method
    // public static void sayHi(){
    // public static void sayHi(String name){
    public static String sayHi(String name){ //返すときは型をつける
        // System.out.println("Hi!!"); 
        // System.out.println("Hi!!" + name); 
        return "Hi!!" + name;
    }
    public static void main(String[] args){
        // sayHi();
        // sayHi("Tom");
        // sayHi("Bob");
        String msg = sayHi("Steve");
        System.out.println(msg); 
    }
}

public class Fundamental{

    public static void sayHi(String name){
        // int x = 10;
        System.out.println("Hi!" + name); 
    }

    //overload

    public static void sayHi(){
        System.out.println("Hi! Nobody"); 
    }
    public static void main(String[] args){
        sayHi();
        sayHi("Bob"); //引数
    }
}

class User {
    //変数とメソッドを定義する
    String name = "Me!"; //クラスに属する変数をフィールドという

    void sayHi(){
        System.out.println("hi!!"); 
    }
}

public class Fundamental{

    public static void main(String[] args){
        // int x;
        // String s;

        //class classは変数とメソッドをもたせることができる
        User tom; //User型の変数名Tom
        tom = new User(); //メモリ上に確保してくれてtomにはその番地や値が格納される　//インスタンス
        //User tom = new User();

        System.out.println(tom.name); 
        tom.sayHi();
    }
}

class User{
    String name;

    //constructor クラスと同じメソットを作成
    User(String name){
        this.name = name;
    }

    //this()

    User(){
        // this.name = "Me";
        this("Me!!");
    }

    void sayHi(){
        System.out.println("Hi!!" + this.name); 
    }

}

public class Fundamental{

    public static void main(String[] args){

        User tom;
        // tom = new User("Tom");
        tom = new User(); //インスタンス化

        System.out.println(tom.name); 
        tom.sayHi();
    }
}



class User{ //親クラス
    String name;

    //constructor クラスと同じメソットを作成
    User(String name){
        this.name = name;
    }

    //this()

    User(){
        // this.name = "Me";
        this("Me!!");
    }

    void sayHi(){
        System.out.println("Hi!!" + this.name); 
    }

}

class AdminUser extends User{ //小クラス

    AdminUser(String name){ //コンストラクタの設定
        super(name); //引き継ぐ 親クラス
    }

    //メソットの追加
    void sayHello(){
        System.out.println("Hello!!" + this.name); 
    }

    //親クラスの上書きも可能となる
    @Override //overrideしたことを表す
    void sayHi(){
        System.out.println("[admin] Hi!!" + this.name); 
    }
}

public class Fundamental{

    public static void main(String[] args){

        User tom;
        // tom = new User("Tom");
        tom = new User(); //インスタンス化

        System.out.println(tom.name); 
        tom.sayHi();

        AdminUser Bob = new AdminUser("Bob");
        System.out.println(Bob.name);
        Bob.sayHi(); //継承しているため使える
        Bob.sayHello();
    }
}


class User{ //親クラス
    String name;

    //constructor クラスと同じメソットを作成
    User(String name){
        this.name = name;
    }

    //this()

    User(){
        // this.name = "Me";
        this("Me!!");
    }

    void sayHi(){
        System.out.println("Hi!!" + this.name); 
    }

}

class AdminUser extends User{ //小クラス

    AdminUser(String name){ //コンストラクタの設定
        super(name); //引き継ぐ 親クラス
    }

    //メソットの追加
    void sayHello(){
        System.out.println("Hello!!" + this.name); 
    }

    //親クラスの上書きも可能となる
    @Override //overrideしたことを表す
    void sayHi(){
        System.out.println("[admin] Hi!!" + this.name); 
    }
}

public class Fundamental{

    public static void main(String[] args){

        User tom;
        // tom = new User("Tom");
        tom = new User(); //インスタンス化

        System.out.println(tom.name); 
        tom.sayHi();

        AdminUser Bob = new AdminUser("Bob");
        System.out.println(Bob.name);
        Bob.sayHi(); //継承しているため使える
        Bob.sayHello();
    }
}

//コンストラクタとは、クラスのインスタンス生成時に実行されるメソッドで、主にそのクラスのメンバ変数を初期化するときに使用します。
//コンストラクタはインスタンス生成時に呼び出される特別なメソッドで、通常のメソッド同様に引数を指定することも可能です。

// //呼び出す方法
// ConstructorSample.java
class CnstructorSample{
    String str = "kusaman";

    //コンストラクタ
    public CnstructorSample(){
        System.out.println(str);
        }
    }
    //Main.java
    public class Fundamental {

        public static void main(String[] args){
            //インスタンスの生成
            CnstructorSample cs = new CnstructorSample();
        }
}

// //引数を指定する方法
//ConstructorSample.java
class ConstructorSample{
    String str1 = "kusaman";

    //コンストラクタ
    public ConstructorSample(){
        System.out.println(str1);
    }

    //引数コンストラクタ
    public ConstructorSample(String str2){
        System.out.println(str1 + " " + str2);
    }
}

//Fundamental.java
public class Fundamental{

    public static void main(String[] args){
        //インスタンスの作成
        ConstructorSample cs = new ConstructorSample("blog");
    }
}

//引数で渡した値をthisで受け取る方法
// ConstructorSample.java
class ConstructorSample{
    String str;

    //引数を持つコンストラクタ
    public ConstructorSample(String str){
        this.str = str;
        System.out.println(this.str);
    }
}

//Fundamental.java
public class Fundamental{

    public static void main(String[] args){
        
        //インスタンスの作成
        ConstructorSample cs = new ConstructorSample("kumasan");
    }
}


//メソッドを呼び出し例外が発生する場合
// ConstructorSample.java
class ConstructorSample{
    private String str;

    //コンストラクタ
    public ConstructorSample(String str) throws NullPointerException{
        this.str = str;
        System.out.println(this.str.length());
    }
}

public class Fundamental {

    public static void main(String[] args){
        String str = null;
        try{
            ConstructorSample cs = new ConstructorSample(str);
        }catch(NullPointerException e){
            System.out.println(e);
        }
    }
}

//NullPointerExceptionとは、null値の参照型変数を参照しようとした時に発生する例外です。

//sampleコード
public class Fundamental{
    public static void main(String[] aegs){
        String str = null;
        System.out.println(str.length());
    }
}

//NullPointerExceptionの回避方法
public class Fundamental{
    public static void main(Srting[] args){
        String str = null;
        try{
            if(str != null){
                System.out.println(str.length());
            }else{
                throw new NullPointerException();
            }catch(NullPointerException e){
                e.printStackTrace();
            }
        }
    }
}

//tryを使った構文
try{
    int n[] = {18, 29, 36};

    System.out.println("開始します");

    for(int i = 0; i < 4; i++){
        System.out.println(n[i]);
    }

    System.out.println("終了します");
}
catch(例外クラス, 変数名){

}