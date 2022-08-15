import java.util.Scanner;

public class Sanduiche {
    private String pao, queijo, carne, verdura, molho, outros;
    private int opcao, quantP, quantQ, quantC, quantV, quantM, quantO;
    private double valorPao, valorQueijo, valorCarne, valorVerdura, valorMolho, valorOutros;

    Scanner input = new Scanner(System.in);
    Cardapio cardapio = new Cardapio();

    public String getPao(){
        return this.pao;
    }

    public void setPao(String pao){
        this.pao = pao;
    }

    public String getQueijo(){
        return this.queijo;
    }

    public void setQueijo(String queijo){
        this.queijo = queijo;
    }

    public String getCarne(){
        return this.carne;
    }
    
    public void setCarne(String carne){
        this.carne = carne;
    }

    public String getVerdura(){
        return this.verdura;
    }

    public void setVerdura(String verdura){
        this.verdura = verdura;
    }

    public String getMolho(){
        return this.molho;
    }

    public void setMolho(String molho){
        this.molho = molho;
    }

    public String getOutro(){
        return this.outros;
    }

    public void setOutros(String outros){
        this.outros = outros;
    }

    public double getValorPao() {
        return this.valorPao;
    }

    public void setValorPao(double valorPao) {
        this.valorPao = valorPao;
    }

    public double getValorQueijo(){
        return this.valorQueijo;
    }

    public void setValorQueijo(double valorQueijo){
        this.valorQueijo = valorQueijo;
    }

    public double getValorCarne(){
        return this.valorCarne;
    }

    public void setValorCarne(double valorCarne){
        this.valorCarne = valorCarne;
    }

    public double getValorVerdura(){
        return this.valorVerdura;
    }

    public void setValorVerdura(double valorVerdura){
        this.valorVerdura = valorVerdura;
    }

    public double getValorMolho(){
        return this.valorMolho;
    }

    public void setValorMolho(double valorMolho){
        this.valorMolho = valorMolho;
    }

    public double getValorOutros(){
        return this.valorOutros;
    }

    public void setValorOutros(double valorOutros){
        this.valorOutros = valorOutros;
    }

    public int getQuantP() {
        return quantP;
    }

    public void setQuantP(int quantP) {
        this.quantP = quantP;
    }

    public int getQuantQ() {
        return quantQ;
    }

    public void setQuantQ(int quantQ) {
        this.quantQ = quantQ;
    }

    public int getQuantC() {
        return quantC;
    }

    public void setQuantC(int quantC) {
        this.quantC = quantC;
    }

    public int getQuantV() {
        return quantV;
    }

    public void setQuantV(int quantV) {
        this.quantV = quantV;
    }

    public int getQuantM() {
        return quantM;
    }

    public void setQuantM(int quantM) {
        this.quantM = quantM;
    }

    public int getQuantO() {
        return quantO;
    }

    public void setQuantO(int quantO) {
        this.quantO = quantO;
    }

    public void iniciarPedido(){
        while (true){
            cardapio.menuPrincipal();
            System.out.print("Sua opcão: ");
            opcao = input.nextInt();
            if (opcao == 1){
                escolhePao();
            }else if (opcao == 2){
                escolheQueijo();
            }else if (opcao == 3){
                escolheCarne();
            }else if (opcao == 4){
                escolheVerduras();
            }else if (opcao == 5){
                escolheMolho();
            }else if (opcao == 6){
                escolheOutros();
            }else if (opcao == 7){
                total();
                break;
            }else{
                System.out.println("Inválido");
            }
        }
    }

    public void escolhePao(){
        cardapio.menuPao();
        while(true){
            System.out.print("Sua opcão: ");
            opcao = input.nextInt();
            if (opcao == 1){
                setPao("Pão Francês");
                setValorPao(0.25);
                break;
            }else if (opcao == 2){
                setPao("Pão Carteira");
                setValorPao(0.30);
                break;
            }else if (opcao == 3){
                setPao("Pão de Hambúrguer");
                setValorPao(0.70);
                break;
            }else if (opcao == 4){
                setPao("Pão Árabe");
                setValorPao(1.30);
                break;
            }else{
                System.out.println("Inválido");
            }
        }
        System.out.print("Quantidade: ");
        setQuantP(input.nextInt());
        setValorPao(getQuantP() * getValorPao());
        
    }

    public void escolheQueijo(){
        cardapio.menuQueijo();
        while (true){
            System.out.print("Sua opcão: ");
            opcao = input.nextInt();
            if (opcao == 1){
                setQueijo("Coalho");
                setValorQueijo(1.50);
                break;
            }else if (opcao == 2){
                setQueijo("Minas");
                setValorQueijo(1.80);
                break;
            }else if (opcao == 3){
                setQueijo("Muçarela");
                setValorQueijo(2.00);
                break;
            }else if (opcao == 4){
                setQueijo("Creem Cheese");
                setValorQueijo(3.00);
                break;
            }else if (opcao == 5){
                setQueijo("Gorgonzola");
                setValorQueijo(3.50);
                break;
            }else{
                System.out.println("Inválido");
            }
        }
        System.out.print("Quantidade: ");
        setQuantQ(input.nextInt());
        setValorQueijo(getQuantQ() * getValorQueijo());

    }

    public void escolheCarne(){
        cardapio.menuCarne();
        while (true){
            System.out.print("Sua opcão: ");
            opcao = input.nextInt();
            if (opcao == 1){
                setCarne("Mortadela");
                setValorCarne(0.50);
                break;
            }else if (opcao == 2){
                setCarne("Apresuntado");
                setValorCarne(1.00);
                break;
            }else if (opcao == 3){
                setCarne("Bacon");
                setValorCarne(1.30);
                break;
            }else if (opcao == 4){
                setCarne("Presunto");
                setValorCarne(1.60);
                break;
            }else if (opcao == 5){
                setCarne("Peperonni");
                setValorCarne(1.80);
                break;
            }else if (opcao == 6){
                setCarne("Salame");
                setValorCarne(2.00);
                break;
            }else{
                System.out.println("Inválido");
            }
        }
        System.out.print("Quantidade: ");
        setQuantC(input.nextInt());
        setValorCarne(getQuantC() * getValorCarne());
    }

    public void escolheVerduras(){
        cardapio.menuVerdura();
        while (true){
            System.out.print("Sua opcão: ");
            opcao = input.nextInt();
            if (opcao == 1){
                setVerdura("Cebola");
                setValorVerdura(0.30);
                break;
            }else if (opcao == 2){
                setVerdura("Pimentão");
                setValorVerdura(0.45);
                break;
            }else if (opcao == 3){
                setVerdura("Tomate");
                setValorVerdura(0.50);
                break;
            }else{
                System.out.println("Inválido");
            }
        }

        System.out.print("Quantidade: ");
        setQuantV(input.nextInt());
        setValorVerdura(getQuantV() * getValorVerdura());
    }

    public void escolheMolho(){
        cardapio.menuMolho();
        while (true){
            System.out.print("Sua opcão: ");
            opcao = input.nextInt();
            if (opcao == 1){
                setMolho("Maionese");
                setValorMolho(0.50);
                break;
            }else if (opcao == 2){
                setMolho("Ketchup");
                setValorMolho(0.50);
                break;
            }else if (opcao == 3){
                setMolho("Maionese Temperada");
                setValorMolho(0.70);
                break;
            }else if (opcao == 4){
                setMolho("Molho Tártaru");
                setValorMolho(1.00);
                break;
            }else if (opcao == 5){
                setMolho("Barbecue");
                setValorMolho(1.50);
                break;
            }else{
                System.out.println("Inválido");
            }
        }
        System.out.print("Quantidade: ");
        setQuantM(input.nextInt());
        setValorMolho(getQuantM() * getValorMolho());

    }

    public void escolheOutros(){
        cardapio.menuOutros();
        while (true){
            System.out.print("Sua opcão: ");
            opcao = input.nextInt();
            if (opcao == 1){
                setOutros("Batata Palha");
                setValorOutros(1.00);
                break;
            }else if (opcao == 2){
                setOutros("OVO");
                setValorOutros(1.00);
            }else{
                System.out.println("Inválido");
            }
        }
        System.out.print("Quantidade: ");
        setQuantO(input.nextInt());
        setValorOutros(getQuantO() * getValorOutros());
    }

    public void total(){
        System.out.println("=======================PEDIDO=======================");
        System.out.println(getQuantP() + "x " + "PÃO: " + getPao() +  " PREÇO: " + getValorPao());
        System.out.println(getQuantQ() + "x " +"QUEIJO: " + getQueijo() + " PREÇO: " + getValorQueijo());
        System.out.println(getQuantC() + "x " + "CARNE: " + getCarne() + " PREÇO: " + getValorCarne());
        System.out.println(getQuantV() + "x " + "VERDURA: " + getVerdura() + " PREÇO: " + getValorVerdura());
        System.out.println(getQuantM() + "x " + "MOLHO: " + getMolho() + " PREÇO: " + getValorMolho());
        System.out.println(getQuantO() + "x " + "Outros: " + getOutro() + " PREÇO: " + getValorOutros());
        double valorParcial = getValorPao() + getValorQueijo() + getValorCarne() + getValorVerdura() + getValorMolho() + getValorOutros();
        System.out.printf("Valor Parcial: %.2f" , valorParcial);
        System.out.println();
        System.out.println("====================================================");

        System.out.print("Quantos sanduiches com a composição acima você deseja? ");
        opcao = input.nextInt();
        while (true){
        if (opcao > 0){
            double totalGeral = ((getValorPao() + getValorQueijo() + getValorCarne() + getValorVerdura() + getValorMolho() + getValorOutros()) * opcao);
            System.out.println("====================================================");
            System.out.println("PEDIDO EFETUADO COM SUCESSO");
            System.out.printf("Valor total do pedido: %.2f" , totalGeral);
            System.out.println();
            System.out.println("====================================================");
            break;
        }else if (opcao == 0){
            System.out.println("PEDIDO CANCELADO COM SUCESSO");
            break;
        }else{
            System.out.println("INVÁLIDO");
        }
    }
    } 
}
