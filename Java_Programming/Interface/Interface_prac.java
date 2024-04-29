interface EC{
    void casteVote();
}

interface Voter{

    void checkValidityOfVoter(int age);
}

class ECIndia implements Voter,EC{
    int minAge;
    ECIndia(int minAge){
        this.minAge = minAge;
    }
    public void casteVote(){

    }

    public void checkValidityOfVoter(int age){
        try{
            if(age < minAge){
                throw new InvalidVoterException("Minimumm age is 18");
            }
            else if(age>=150){
                throw new InvalidVoterException("Not a Human");
            }
        }
        catch(Exception ex){
            System.out.println(ex);
            for(StackTraceElement element : ex.getStackTrace()){
                System.out.println(element);
                System.out.println(element.getClassName() + "." + element.getMethodName() + "(" + element.getFileName()  		+":"+element.getLineNumber()+")");//this line can replace the toString() or printing(includes line no in main and this method
            }
        }
    }

}

class Interface_prac{
    public static void main(String args[]){
        ECIndia ecindia = new ECIndia(18);
        ecindia.casteVote();
        ecindia.checkValidityOfVoter(13);
        ecindia.checkValidityOfVoter(67);
    }
}

class InvalidVoterException extends Exception{
    InvalidVoterException(String error){
        super(error);
    }
}