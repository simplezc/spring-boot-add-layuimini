import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.security.PublicKey;
import java.text.DecimalFormat;
import java.util.*;

public class Text {

    public static void main(String[] args) {

        f28();

    }
    //5689. 统计匹配检索规则的物品数量
    public static void f28(){
    }

    //5687. 执行乘法运算的最大分数 ×
    public static void f27(){
        int nums[] = {-5,-3,-3,-2,7,1};
        int multipliers[] = {-10,-5,3,4,6};
        int num = 0;
        int left=0,right=nums.length-1;
        int muli = 0;
        while (multipliers.length-1>=muli){
            int n=0;
            if(nums[left]*multipliers[muli]>nums[right]+multipliers[muli]){
                n=nums[left]*multipliers[muli];
                left++;
            }else {
                n=nums[right]*multipliers[muli];
                right--;
            }
            muli++;
            num=n;
            System.out.println(num);
        }
       // System.out.println(num);
    }

    //5686. 移动所有球到每个盒子所需的最小操作数
    public static void f26(){
        String boxes="110";
        int length = boxes.length();
        int arr[] = new int[boxes.length()];

        for(int i=0; i<boxes.length() ; i++){
            int num=0;
            for(int j=0; j<boxes.length(); j++){

                if(boxes.charAt(j)=='1'){
                    if(j<i){
                        num+=i-j;
                    }else {
                        num+=j-i;
                    }

                }
            }
            arr[i] = num;

        }
       /* for(int i=0;i<boxes.length();i++){
            System.out.println(arr[i]);
        }*/
    }

    //5685. 交替合并字符串
    public static void f25(){
     String   word1 = "abcd", word2 = "pq";
     int str1=word1.length(),str2=word2.length();
     int i=0;
     StringBuilder stringBuilder = new StringBuilder();
     while(str2!=0||str1!=0){
         if(str1>0){
             stringBuilder.append(word1.charAt(i));
             str1--;
         }
         if(str2>0){
             stringBuilder.append(word2.charAt(i));
             str2--;
         }
         i++;
        }
     System.out.println(stringBuilder);

    }
    //5678. 袋子里最少数目的球
    public static void f24(){
        int nums[] ={9}; int k=2;
        int n[] =new int[100];
        int num=0;
        if(nums[0]%2==0){
            n[0] = 2;
            n[1] = num/2;
        }else if(nums[0]%3==0){
            n[0] = 3;
            n[1] = num/3;
        }else if(nums[0]%5==0){
            n[0] = 5;
            n[1] = num/5;
        }
        for(int i=0; i<k; i++){
          System.out.println(n[i]);
        }
    }


//    5677. 统计同构子字符串的数目 ×
public static void f23(){
    String s="zzzzzzzz";
    int n=1,sum=0;

    for(int i=1; i<s.length(); i++){
        if(s.charAt(i)==s.charAt(i-1)){
            System.out.println(i);
            n++;
        }
        if(s.charAt(i)!=s.charAt(i-1)||i==s.length()-1){
            int m=0;
            for(int j=1; j<=n; j++){
                m+=j;
            }
           // System.out.println(m);
            sum+=m;
            n=1;
        }
        if(s.charAt(i)!=s.charAt(s.length()-2)){
            sum++;
        }
    }
    System.out.println(sum);

}

    //5676. 生成交替二进制字符串的最少操作数
    public static void f22(){
        String s = "01";
        int cnt = 0, len = s.length();
        char f[] = {'0','1'};
        for(int i = 0 ; i < len; i++)
            if(s.charAt(i) != f[i%2])
                cnt++;
      //  return Math.min(cnt,len-cnt);
    }

    //703. 数据流中的第 K 大元素
    public static void f21(){
        int[] nums = {15989,914,15758,2840,11076,8864,5365,10111,16270,14273,3732,3015};
        int[] n = new int[nums.length+1];
        Set set = new HashSet();
        List list = new ArrayList();
        for(int i =0; i<nums.length; i++){
        set.add(nums[i]);
        }
        //Arrays.sort(set.toArray());
        for(int i =0; i<set.toArray().length; i++){
           // System.out.println((int)set.toArray()[i]);
         n[(int)set.toArray()[i]]=1;
        }
        for(int i =1; i<=nums.length; i++){
          if(n[i]!=1){
              list.add(i);
          }
         // System.out.print(n[1]);
        }
        System.out.println(list.get(0));
    }
    public int add(int val) {

        return 0;
    }
    //面试题 17.16. 按摩师
    public static void f20(){
        int nums[] = {1,2,3,1};
        int n=0,m=0;
        for(int i=0; i<nums.length; i++){
            if(i%2==1){
                n+=nums[i];
            }else {
                m += nums[i];
            }
        }
        System.out.println(Math.max(m,n));
    }

    //面试题 16.17. 连续数列
    public static void f19(){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int max = nums[0];
        int num = 0;
        System.out.println(  Math.max(nums[0]+nums[1],Math.max(nums[0],nums[1])));
        for(int i=1; i<nums.length; i++){
            num = Math.max(num+nums[i],nums[i]);
            max = Math.max(max,num);
           // System.out.println(num+"---"+max);
        }
        System.out.println(max);
       /* int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }*/
    }

    //567. 字符串的排列
    public static void f18(){
     String   s1 = "adc", s2="dcda";
     char cha[] = new char[s1.length()];
        char cha1[] = new char[s1.length()];
     int sum = 0,n=0;
     int m= 0;
     for(int i =0; i<s1.length(); i++){
         sum+= s1.charAt(i);
         cha1[i] = s1.charAt(i);
     }
     int left = 0, right =s1.length();
     while (right!= s2.length()+1){
         m=0;
         n=0;
         for(int i=left; i<right; i++,n++){
             m+=s2.charAt(i);
             cha[n] = s2.charAt(i);
            // System.out.println(m+"--"+sum);

         }

         Arrays.sort(cha);
         Arrays.sort(cha1);
         String str = String.valueOf(cha);
         String str1 = String.valueOf(cha1);
         if(sum == m&&str1.equals(str)){

            System.out.println(true);
         }
         left++;
         right++;
     }
     System.out.println(false);
    }

    //480. 滑动窗口中位数
    public static void f17(){
        int k=4,n=0;
        int nums[] = {1,4,2,3};
        double number[] = new double[nums.length-2];
        if(nums.length==k){number = new double[1];
            Arrays.sort(nums);
            if(k%2==1){

                number[0]=nums[(nums.length/2)-1];
                System.out.println(number[0]);
            }else {
                System.out.println((nums.length/2)+"--"+((nums.length/2)-1));
                number[0]= (nums[(nums.length/2)]+nums[(nums.length/2)-1])/2;
                System.out.println(number[0]);
            }
        }

        int sum = 0;
        int numk[] = new int[k];
        int left = 0,right = k;
        while (right<nums.length+1){
            n=0;
            for(int i=left; i<right; i++,n++){
                numk[n]=nums[i];
                sum++;
            }
            Arrays.sort(numk);
            if(k%2==1){
                number[left] = numk[(k+1)/2-1];
            }else {
                number[left] = 1.0*(numk[k/2]+numk[k/2-1])/2;
            }
            System.out.println();
            left++;
            right++;
        }
        for(int i=0; i<nums.length-2; i++){
            System.out.println(number[i]);
        }

    }

    public static void f16(){
        int nums[] = {1,3,6,7,9,4,10,5,6};
        int number[] = new  int[nums.length];
        int ii = 1;
        for(int i= 0; i<nums.length; i++){
            number[i]=ii;
        }
       int max = 0,n=1;
        for(int i=1; i<nums.length; i++){

            for( int j=0; j<i; j++){
                if(nums[i]>nums[j]){
                  //  number[i] = number[j]+1;
                  number[i]= Math.max(number[i],number[j]+1);
                }
            }
        }
        Arrays.sort(number);
        for(int i= 1; i<nums.length; i++){
        //  max = (Math.max(number[i-1],number[i]));
         //   System.out.println(number[i]);
        }
        System.out.println(number[nums.length-1]);
    }

    //双指针
    public static void f15(){
        int nums[] = {9,4,2,10,7,8,8,1,9};
        int len = nums.length;
        if(len<2){
            System.out.println(1);
        }
        int left = 0;
        int right = 1;
        boolean bool = false;
        int res= 1;
        while(right<len){
           boolean bool1 = nums[right-1]< nums[right];
            if(right == 1||bool1==bool){
                left = right-1;
            }
            if(nums[right-1] == nums[right]){
                left = right;
            }
            right++;
             res = Math.max(res,right-left);
             bool=bool1;
        }
        System.out.println(res);
    }

    public static void f14(){
     String   word1 = "cabaa", word2 = "bcaaa";

    String str1[] =  word1.split("");
        String str2[] =  word2.split("");
System.out.println(word1.charAt(0));
int n=0;
     int wo1=0 ,wo2=0;
     StringBuilder stringBuilder = new StringBuilder();
     while (n<8){
         if( word1.charAt(wo1)>word2.charAt(wo2)){
             stringBuilder.append(word1.charAt(wo1));
             str1[wo1]="";
             wo1++;
         }else if(word1.charAt(wo1)<word2.charAt(wo2)){
             stringBuilder.append(word2.charAt(wo2));
             str2[wo2]="";
             wo2++;
         }
         else if(word1.charAt(wo1)==word2.charAt(wo2)){
             char cha1=' ' ,cha2 = ' ';

             if(wo1+1!=word1.length()){
                  cha1=word1.charAt(wo1 + 1);

             }else {
                 cha1=word1.charAt(wo1);
             }
             //-------------------
             if(wo2+1!=word2.length()){
                 cha2 = word2.charAt(wo2 + 1);

             }else {
                 cha2=word2.charAt(wo2);
             }
                 if ( cha1> cha2) {
                     stringBuilder.append(word1.charAt(wo1));
                     str1[wo1] = "";
                     wo1++;
                 } else {
                     stringBuilder.append(word2.charAt(wo2));
                     str2[wo2] = "";
                     wo2++;
                 }
         }n++;
     }
     System.out.println(stringBuilder);

    }

    public static void f13(){
       int  a = 1, b = 8, c = 8;
       int n[] = new int[3];
       n[0]=a;n[1]=b ; n[2]=c;
       int j = 1;
       boolean bool = true;
     while (bool){
         Arrays.sort(n);
         n[1]--;n[2]--;
         if(n[1]==0&&n[0]==0||n[1]==0&&n[2]==0){
             bool=false;
         }
         System.out.println(++j);
     }
        System.out.println(j);
    }

   public static void f12(){
       /* int nums[] = {57,58,60,63,65,66,69,70,71,71,72,73,74,76,77,78,81,85,85,86,88,89,90,91,92,92,96,97,99,5,5,6,8,14,16,17,18,22,23,24,26,27,28,32,35,38,42,48,50,52,52,57};

       int n = nums.length;
       int m = 0;
       boolean bool = false;
        for(int i =0; i<nums.length; i++){int j = 0;
            m=nums[0];
            while(j<nums.length-1){
                nums[j]=nums[j+1];
                j++;
            }
           nums[n-1]=m;

          bool = isSort(nums);
          if (bool==true){
              break;
          }
        }
        System.out.println(bool);*/

    }
    public static void isSort(int[] array) {
        int n=0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {

               n++;
            }
        }
        System.out.println(n);

    }

    public static void f11(){
       double n = 0;
        String s = "+1";
        if(s==null||s.equals("")){
            return;
        }
        s = s.trim();
        StringBuilder stringBuilder = new StringBuilder();
        if(s.charAt(0)=='-'){

            if (s.charAt(1) >= '0' && s.charAt(1) <= '9') {
                stringBuilder.append('-');
                for(int i=0; i<s.length();i++){
                    if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                        stringBuilder.append(s.charAt(i));
                    }
                } n=  Double.valueOf(stringBuilder.toString());
            }else {
                System.out.println(0);
            }

        }else if (s.charAt(0)>='0'&&s.charAt(0)<='9'||s.charAt(0)=='+'){
            if(s.charAt(0)=='+'){
               s= s.replace("+","");
            }

            for(int i=0; i<s.length();i++){
                if(s.charAt(i)>='0'&&s.charAt(i)<='9'){

                    stringBuilder.append(s.charAt(i));
                }else {
                    break;
                }
            }
          n=  Double.valueOf(stringBuilder.toString());
        }else if (s.charAt(0)>='a'&&s.charAt(0)<='z'||s.charAt(0)>='A'&&s.charAt(0)<='Z'){
            System.out.println(0);
        }

        if(n>-2147483648&&n<2147483647){

            System.out.println(n);
        }else if(n<0){
            System.out.println(-2147483648);
        }else if(n>0){
            System.out.println(2147483647);
        }


    }

    //滑动框
    public static void f10() {

        int[] nums = {1,2,3,4,5,6,1}; int k= 3;
        int len = nums.length-k;
        int sum = 0,o = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        int min = sum;
        for(int i= len; i<nums.length; i++){
            sum += nums[i] - nums[i-len];
            min = Math.min(min,sum);
        }
        for(int i = 0; i<nums.length; i++){
            o+=nums[i];
        }

        System.out.println(o);
    }
    //力扣5654
    public static void f9(){
        int lo=19,hi=28;
        Integer m[] = new Integer[10000];
        for(int n=0; n<10000; n++){
            m[n] = 0;
        }

        for(int i=lo; i<=hi;i++){
            String str = String.valueOf(i);
            String s[] = str.split("");

            //将字符串拆分并相加
            int number =0;
            for(int n =0; n<s.length; n++){
                int Intn = Integer.valueOf(s[n]);
                number +=Intn;
            }
            m[number]+=1;
        }
        Arrays.sort(m, Collections.reverseOrder());
        System.out.println(m[0]);
    }

    public static void f8(){
      String  a = "abafadsvadhbcv", b = "odfsbfd";
      char char1 = 0,char2 = b.charAt(0);
      for(int i=0; i<a.length(); i++){
          if(a.charAt(i)>char1){
              char1=a.charAt(i);
          }
      }

      for(int i=1; i<b.length(); i++){
            if(char2>b.charAt(i)){
                char2=b.charAt(i);
            }
        }
        StringBuilder strBuilder = new StringBuilder(b);
        int c = char1-char2;
        for(int i=0; i<b.length(); i++){

        }
      System.out.println(char1-char2);
    }


    //判断是否是字母
    private static boolean isAplhan(char c){
        return (c>='a'&&c<= 'z') || (c>='A' && c<='Z');
        /*public boolean isPalindrome(String s) {
            if (s == null || s.length() == 0) return true;

            int i = 0, j = s.length() - 1;
            for (; i < j; ++i, --j) {
                while (i < j && !isAlphanumeric(s.charAt(i))) ++i;
                while (i < j && !isAlphanumeric(s.charAt(j))) --j;
                if (i < j && !isEqualIgnoreCase(s.charAt(i), s.charAt(j))) return false;
            }
            return true;
        }*/
    }
    //忽略大小写判断字母是否相等
    private boolean Case(char a, char b){
        if(a>='A'&&a<= 'Z') a+=32;
        if(b>='A'&&b<= 'Z') b+=32;
        return a==b;
    }
    //判断油表
    public static void f7(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String str[] = s.split(" ");
        for(int i=0;i<6;i++){
            if(Integer.valueOf(str[i])<0&&Integer.valueOf(str[i])>400){
                return;
            }
        }
        int num = 0;int n=0;
        int m=0;int nn=0;
        int number[] = new int[4];
        int ber[] = new int[4];

        for(int i=0; i<4; i++){
            number[i] =  Integer.valueOf(str[i])-Integer.valueOf(str[4]);
            ber[i] = Integer.valueOf(str[i]);
        }
        for(int i=0; i<4; i++){
            Arrays.sort(ber);
            m = ber[3]-Integer.valueOf(str[i]);
            nn++;
           int j= Integer.valueOf(str[i])-Integer.valueOf(str[4]);
            if(m>Integer.valueOf(str[5])||j<0){
                num++;
                n=i+1;
            }
        }
        if(num==0){
            System.out.println("Normal");
        }else if (num==1&&n!=0){
            System.out.printf("Warning: please check #%d!",n);
        }else if(num>=2){
            System.out.println("Warning: please check all the tires!");
        }


    }
    //判断字符串是否是数字
    public static boolean shuzi(char c){
        return (c>= '0'&& c<= '9');
    }
    public static void f6() {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num = Integer.valueOf(s);
        String str[] = new String[num];
        String[] result=new String[100];
        String strnum[] = null;
        //输入字符不能大于80
        if (s.length() > 0 && s.length() <= 80 && s != null && s != "") {
            for (int i = 0; i < num; i++) {
                str[i] = scanner.nextLine();
                strnum = str[i].split("");
            }
            int countzimu=0,countshuzi=0;
            int flag=1;
            for (int i = 0; i < num; i++) {
                //判断是否符合长度

                if (str[i].length() < 6) {
                    System.out.println("Your password is tai duan le.");
                    continue;
                }else if (isAplhan(str[i].charAt(i)) == false) {
                    countzimu++;
                    continue;
                } else if ((shuzi(str[i].charAt(i))) == false) {
                    countshuzi++;
                    continue;
                }else if(str[i].charAt(i)!='.'){
                    result[i]="Your password is tai luan le.";
                    flag=0;
                    break;
                }
                if(flag==0);
                else if(countshuzi>0&&countzimu>0)
                {
                    result[i]="Your password is wan mei.";
                }
                else if(countshuzi>0&&countzimu==0)
                {
                    result[i]="Your password needs zi mu.";
                }
                else
                {
                    result[i]="Your password needs shu zi.";
                }
            }

            for( int i=0;i<num;i++)
            {
                System.out.println(result[i]);
            }
        }
    }
    public static boolean is_alpha(String str) {
        if(str==null) return false;
        return str.matches("[a-zA-Z]+");
    }

    public static void f5(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num = Integer.valueOf(s);
        int n[][] = new int[num+1][num+1];
        for(int i=1; i<=num; i++){


            for(int j =1; j<=num; j++){
                n[i][j]=0;
                if(i==1||j==1||i==num||j==num){
                    n[i][j]=1;
                }

                if(i==j){
                    n[i][j]=2;
                }
                if(i+j==num+1){
                    n[i][j]=2;
                }
            }
        }
        for(int i=1; i<=num; i++){

            System.out.println("");
            for(int j =1; j<=num; j++){
                System.out.print(n[i][j]+" ");
            }
        }



    }
    public static void f4(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String str[] = s.split(" ");

        for(int i=0;i<6;i++){
            if(Integer.valueOf(str[i])<0&&Integer.valueOf(str[i])>400){
                return;
            }
        }
        int num = 0;
        int n=0;
        int m=0;
        int number[] = new int[4];
        int ber[] = new int[4];
        boolean bo = true;
        for(int i=0; i<4; i++){
            if(Integer.valueOf(str[i])>Integer.valueOf(str[4])){
                bo=false;
            }
          number[i] =  Integer.valueOf(str[i])-Integer.valueOf(str[4]);
          ber[i] = Integer.valueOf(str[i]);

            if(number[i]<Integer.valueOf(str[5])){
                num++;
                n=i;
            }
        }
        Arrays.sort(ber);
        m = ber[3]-ber[0];
        if(m<=Integer.valueOf(str[5])&&bo==true){
            System.out.println("Narmal");
        }else if (num==1&&n!=0&&bo==true){
            System.out.printf("Warning: please check #%d!",n+1);
        }else if(num>=2&&bo==true){
            System.out.println("Warning: please check all the tires!");
        }




    }
    public static  void f3(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String str[] = s.split("");
        int n[] = new int[4];
        for(int i =0; i<s.length(); i++){
            if(str[i].equalsIgnoreCase("g")){
               n[0]++;
            }else if (str[i].equalsIgnoreCase("p")){
             n[1]++;
            }else  if (str[i].equalsIgnoreCase("l")){
               n[2]++;
            }else if (str[i].equalsIgnoreCase("t")){
               n[3]++;
            }
        }
        int g=  n[0];int p=   n[1];
        int l=  n[2]; int t =  n[3];
        Arrays.sort(n);
        for(int i=0; i<n[3]; i++){
            String ss[] = new String[4];
            ss[0] = "G";ss[1] = "P";
            ss[2] = "L";ss[3] = "T";
            if(g<=0){
                ss[0]="";
            }
            if(p<=0){
                ss[1]="";
            }
            if(l<=0){
                ss[2]="";
            }
            if(t<=0){
                ss[3]="";
            }
            System.out.printf("%s%s%s%s",ss[0],ss[1],ss[2],ss[3]);
            g=g-1;p=p-1;
            l=l-1;t=t-1;
        }


    }
    public static void f2(){
        Scanner  scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1[] = s.split(" ");
        double n = Double.valueOf(s1[0]);
        double n1 = Double.valueOf(s1[1]);

        if(n1>0){
            Double num = n/n1;
            System.out.printf("%.0f/%.0f=%.2f",n,n1,num);
        }
        if(n1<0){
            Double num = n/n1;
            System.out.printf("%.0f/(%.0f)=%.2f",n,n1,num);
        }
        if(n1==0){
            System.out.printf("%.0f/%.0f=Error",n,n1);
        }



    }
    //输出回型数组
    public static void f1(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = num * num;
        //设置count为所填数字，layer则表示正在填写的层数，从外向内，逐渐增大。
        int count = 0, layer = 0;
        int[][] huixing = new int[num][num];

        //奇数时，中间数为n*n
        if (num % 2 != 0) {
            huixing[num / 2][num / 2] = result;
        }

        for (int i = 0; i < num / 2; i++) {
            //向右
            for (int right = layer; right < num - 1 - layer; right++) {
                huixing[layer][right] = ++count;
            }
            //向下
            for (int down = layer; down < num - 1 - layer; down++) {
                huixing[down][num - layer - 1] = ++count;
            }
            //向左
            for (int left = num - layer - 1; left > layer; left--) {
                huixing[num - layer - 1][left] = ++count;
            }
            //向上
            for (int up = num - 1 - layer; up > layer; up--) {
                huixing[up][layer] = ++count;
            }
            layer++;
        }

        //输出二维数组
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(huixing[i][j] + "\t");
            }
            System.out.print("\n");
        } }
            //正则表达式
            public void f(){
            String str;
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            for(int i=0;i<n;i++) {
                str = sc.nextLine();
                System.out.println(str);
                String str2 = "";
                char[] chars = str.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] >= 'A' && chars[j] <= 'Z' && chars[j] != 'I') {
                        chars[j] += 32;
                    }
                    str2 += chars[j];
                }
                str2 = str2.trim();//去除首尾空格
                str2 = str2.replaceAll(" +", " ");//如果有多个空格，替换为一个空格
                str2 = str2.replaceAll(" (\\W)", "$1");//去除标点符号前的空格（$1表示第一个小括号里的内容）
                str2 = str2.replaceAll("\\?", "!");//将？替换为！
                //--------------------------------------------------------------
                //因为存在"can you"转换为"I can"之后又将"I"转换为"you"的情况，
                //然后题目要求是输出I can",这样才可以AC
                //所以“can you、could you、I、me”应当是在分割线之上的字符串前提下进行操作。
                //暂时将它们使用ABC代替
                str2 = str2.replaceAll("\\bcan you\\b", "A");
                str2 = str2.replaceAll("\\bcould you\\b", "B");
                str2 = str2.replaceAll("\\b(I|me)\\b", "C");

                str2 = str2.replaceAll("A", "I can");
                str2 = str2.replaceAll("B", "I could");
                str2 = str2.replaceAll("C", "you");

                System.out.println("(\\W)" + str2);
            }
        }
}






