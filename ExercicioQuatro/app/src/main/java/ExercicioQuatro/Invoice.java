package ExercicioQuatro;

public class Invoice {
    private int idItem;
    private String descricaoItem;
    private int qtdCompradaItem;
    private float precoUnitarioItem;

    public Invoice(int idItem, String descricaoItem, int qtdCompradaItem, float precoUnitarioItem) {
        this.setIdItem(idItem);
        this.setDescricaoItem(descricaoItem);
        this.setQtdCompradaItem(qtdCompradaItem);
        this.setPrecoUnitarioItem(precoUnitarioItem);
    }

    public double getInvoiceAmount() {
        return qtdCompradaItem * precoUnitarioItem;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtdCompradaItem() {
        return qtdCompradaItem;
    }

    public void setQtdCompradaItem(int qtdCompradaItem) {
        if (qtdCompradaItem < 0) {
            this.qtdCompradaItem = 0;
        } else {
            this.qtdCompradaItem = qtdCompradaItem;
        }
    }

    public float getPrecoUnitarioItem() {
        return precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(float precoUnitarioItem) {
        if (precoUnitarioItem < 0.0f) {
            this.precoUnitarioItem = 0.0f;
        } else {
            this.precoUnitarioItem = precoUnitarioItem;
        }
    }
}
