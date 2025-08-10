import java.util.Scanner;

public class QuestionService {
    Question[] questions =new Question[5];

    String Selection[]=new String[5];
    public QuestionService() {
        questions[0] = new Question(1, "Which programming language is known for its use in web development?", "Java", "CPP", "Python", "JavaScript", "JavaScript");
        questions[1] = new Question(2, "What is the main language used for developing Android apps?", "Java", "CPP", "Python", "CSharp", "Java");
        questions[2] = new Question(3, "Which programming language is often used for data science and machine learning?", "Java", "CPP", "Python", "CSharp", "Python");
        questions[3] = new Question(4, "What language is primarily used for system programming and game development?", "Java", "CPP", "Python", "CSharp", "CPP");
        questions[4] = new Question(5, "Which programming language was developed by Microsoft?", "Java", "CPP", "Python", "CSharp", "CSharp");
    }

    public void displayQuestion(){

        int i=0;
        for(Question q:questions){
            System.out.println("Question no: "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc=new Scanner(System.in);
            System.out.print("Select the option:");
            Selection[i]=sc.nextLine();
            System.out.println("---------------------------------");
            i++;
        }

        System.out.println("Your answers are:");
        int j=0;
        for(String s:Selection){
            System.out.println(j+":"+s);
            j++;
        }
    }

    public void printScore(){
        int score=0;

        for(int i=0;i<questions.length;i++){
            Question que=questions[i];
            String answer=que.getAnswer();
            String userAnswer=Selection[i];

            if(answer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your Score is : "+score);
    }
}
