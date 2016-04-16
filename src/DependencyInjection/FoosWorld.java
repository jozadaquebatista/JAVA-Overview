class factoryPadaria {
    
    public factoryPadaria() {
        System.out.println("[06:00hs] - Opa! ta na hora do sr Zé abrir a padaria para fazer o pão.");
    }
    
    // Faz um novo pao de queijo, de determinado tipo
    public paoDeQueijo fazerPao(String tipoPao) {
    
        switch(tipoPao){
        
            case "queijo":
                return new paoDeQueijo();        
        }
        
        System.out.println("#Opa! A padaria não faz esse tipo de Pão ainda.");
        return null;
        
    }
    
    public factoryPadaria fechaPadaria() {
        System.out.println("[21:45hs] - Vixi, acabou o dia do seu Zé, então ele fechou a padaria.");
        return null;
    }
}

class paoDeQueijo {

    public String descricao;
    
    public paoDeQueijo() {
        descricao = "Hmm... que delicia hehehe!";
    }

    public void comer() {
        System.out.println("[07:45hs - COMENDO O PAO]: " + this.descricao);
    }
}

public class FoosWorld {

    private static factoryPadaria padariaDoSeuZe = null;
    private paoDeQueijo pao = null;

    public FoosWorld() {
        this.padariaDoSeuZe = new factoryPadaria();
    }

    public FoosWorld tomarCafeDaManha(paoDeQueijo pao){
        
        this.pao = pao;
        this.pao.comer();
        this.pao = null;
        
        return this;
    }
    
    public static void main(String[] args) {
    
        System.out.println("[07:35hs]Indo na padaria comprar pão.");
        new FoosWorld().tomarCafeDaManha(padariaDoSeuZe.fazerPao("queijo"));
        
        padariaDoSeuZe.fechaPadaria();
    }

}
