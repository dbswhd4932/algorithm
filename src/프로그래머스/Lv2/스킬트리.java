package 프로그래머스.Lv2;


public class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String s : skill_trees) {
            String skillTree = s;
            for (int i = 0; i < s.length(); i++) {
                String t = String.valueOf(s.charAt(i));

                if (!skill.contains(t)) {
                    skillTree = skillTree.replace(t, "");
                }
            }

            if (skill.indexOf(skillTree) == 0) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        스킬트리 T = new 스킬트리();
        System.out.println(T.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
}
