�ַ���ָ�����ַ����У�java�ַ��������֣�
1:�ַ�������(����ֱ���ַ���������String��Ķ���)
2:�ַ���������ָ��ֵStringBuffer��Ķ���

String���ͣ�
{
    ����String�ַ�����򵥵ķ�ʽ��ʹ���ַ����ı���
    
    �ַ����Ĵ�����ʽ��
    1��ֱ��Ϊ�ַ���������ֵ��
    ���磺
    String str = "hello"��
    2��ʹ��new�ؼ����������ַ�����
    ���磺
    String str1 = new String��"hello"����
    3��ʹ���ַ������������ַ�����
    ���磺
    char str[] = {'h','e','l','l','o'}��
    4:ʹ���ַ�������ķ�ʽ������
    ���磺
    String str[] = {"hello","java"};
    
}
String�����ַ����ĳ��÷�����
{
    1:length���������÷������ڼ����ַ����ĳ��ȣ���
    ���磺
    String str = "javac"��//����һ���ַ���
    System.out.println(str.length());//����Ľ��Ϊ5
    
    ע�⣺���ַ�����null�ַ����ĳ��Ⱦ�Ϊ0
    
        2��getChars�������÷������ڽ��ַ����е��ַ����Ƶ��ַ������С�
    ���磺
    vooid getChars��int srcBegin,intSrcEnd,char[]dst,int dstBegin��;
    ���У�srcBeginΪԭʼ�ַ�������㣬srcEndΪԭʼ�ַ�������ֹ�㣬dstΪĿ������
    dstBeginΪĿ���������㣻
    
    3���ַ����д�Сд��ת����
      (1)public String toLowerCase()//���ص�ǰ�ַ����������ַ�ת��ΪСд����´���
       (2)public String  toUpperCase����//���ص�ǰ�ַ����������ַ�ת��Ϊ��д����´�
        ���ӣ�
        String str = "HeLLoJava";
        String str1 = str.toLowerCase();//����Сдhellojava
        String str2 = str.toUpperCase();//���ش�дHELLOJAVA
    4:charAt��int index�����ַ�����ָ��λ�õ��ַ���
        ���ӣ�
        String str = "javatest";
        char ch = str.charAt(5);//���e
        
    5��concat ���÷������ڽ����÷������ַ�����ָ���ַ������ӣ��������µ��ַ����� 
        ���磺
       e = a.concat(b);//���ַ���a��b�����ӣ��ڽ��丳ֵ��e
}

2{
    
    String,StringBuffer,StringBuilder������
    
    (1)String���ǲ��ɱ��࣬һ��һ��String���񴴽��󣬰�������������е��ַ����ǲ��ɱ��
        ֱ������������١�
        
   ��2��StringBuffer���������һ���ַ����пɱ���ַ�������һ��StringBuffer��������ͨ��
       StringBuffer�ṩ��append������insert������reverse����SetCharAt������setLength����
       �������Ըı�����ַ���������ַ����У�һ��������յ��ַ������Ϳ���ͨ��toString����
       ��������ת��Ϊһ��String����
       
   ��3��StringBuilder��Ҳ�����ַ���������StringBuffer��ͬ����ͬ���ǣ�
        SringBuffer���̰߳�ȫ�ģ���StringBuilderû��ʵ���̰߳�ȫ������
        �����Ըߣ������Ҫ����һ���ɱ���ַ�����������ʹ��StringBuilder
        ��
}


