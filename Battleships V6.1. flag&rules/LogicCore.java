import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LogicCore extends Actor
{
    
    public void act() {
        //Greenfoot.ask("what number");
    }  
    
    //linearArr for blue team
    /*public static int[] generateLinearArr(int x) {
        int[] linearArr=new int[26];
        int position=Greenfoot.getRandomNumber(26);
        for(int i=0;i<26;i++){
            linearArr[i]=Greenfoot.getRandomNumber(1001);
        }
        linearArr[position]=x;
        return linearArr;
    }
    */
    //bsArr for red team
    public  static int[] generateBSArr() {
        int[] bsArr=new int[26];
       // int position=Greenfoot.getRandomNumber(26);
        for(int i=0;i<26;i++){
            bsArr[i]=Greenfoot.getRandomNumber(1001);
        }
        return bsArr;
    }
    
    
}
