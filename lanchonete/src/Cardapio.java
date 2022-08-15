public class Cardapio {
    public void menuPrincipal(){
        System.out.println("""
        [1] PÃO
        [2] QUEIJO
        [3] CARNE
        [4] VERDURA
        [5] MOLHO
        [6] OUTROS
        [7] FINALIZAR PEDIDO
                """);
    }
    public void menuPao(){
        System.out.println("""
        [1] Pão Francês R$ 0,25
        [2] Pão Carteira R$ 0,30
        [3] Pão de Hambúrguer R$ 0,70
        [4] Pão Árabe R$ 1,30
        """);
    }

    public void menuQueijo(){
        System.out.println("""
        [1] Coalho R$ 1,50
        [2] Minas R$ 1,80
        [3] Muçarela R$ 2,00
        [4] Cream Cheese R$ 3,00
        [5] Gorgonzola R$ 3,50
        """);
    }

    public void menuCarne(){
        System.out.println("""
        [1] Mortadela R$ 0,50
        [2] Apresuntado R$ 1,00
        [3] Bacon R$ 1,30
        [4] Presunto R$ 1,60
        [5] Pepperoni R$ 1,80
        [6] Salame R$ 2,00
        """);
    }

    public void menuVerdura(){
        System.out.println("""
        [1] Cebola R$ 0,30
        [2] Pimentão R$ 0,45
        [3] Tomate R$ 0,50
                """);
    }

    public void menuMolho(){
        System.out.println("""
        [1] Maionese R$ 0,50
        [2] Ketchup R$ 0,50
        [3] Maionese Temperada R$ 0,70
        [4] Molho Tártaro R$ 1,00
        [5] Barbecue R$ 1,50        
                """);
    }

    public void menuOutros(){
        System.out.println("""
        [1] Batata Palha R$ 1,00
        [2] Ovo R$ 1,00
                """);
    }
}
