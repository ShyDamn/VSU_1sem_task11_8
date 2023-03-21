public class Main
{
    public static void main(String[] args) {
        String str = "Придумайте сложный пароль вида Az12-67$AF2 ";
        solve(str);
    }

    public static void solve(String str) {
        int temp = 0;
        StringBuilder sb = new StringBuilder();
        String[] s = str.split(" |-|\\$");
        for(int i = 0;i<s.length;i++) {
            temp+=s[i].length();
            sb.append(s[i]).append("(").append(s[i].length()).append(")").append(str.charAt(temp+i));
        }
        System.out.println(sb);
    }

}