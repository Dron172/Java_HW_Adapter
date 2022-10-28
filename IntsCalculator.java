public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        int sumResult = (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        System.out.print("Вычисляем: " + arg0 + " + " + arg1 + " = ");
        return sumResult;
    }

    @Override
    public int mult(int arg0, int arg1) {
        int multResult = (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        System.out.print("Вычисляем: " + arg0 + " * " + arg1 + " = ");
        return multResult;
    }

    @Override
    public int pow(int a, int b) {
        int powResult = (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        System.out.print("Вычисляем: " + a + " ^ " + b + " = ");
        return powResult;
    }

    @Override
    public int sub(int arg0, int arg1) {
        int subResult = (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUB)
                .result();
        System.out.print("Вычисляем: " + arg0 + " - " + arg1 + " = ");
        return subResult;
    }

    @Override
    public int div(int arg0, int arg1) {
        int divResult = (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.DIV)
                .result();
        System.out.print("Вычисляем: " + arg0 + " / " + arg1 + " = ");
        return divResult;
    }
}