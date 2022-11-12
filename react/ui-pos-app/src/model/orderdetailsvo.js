export default class OrderDetailsVo {
    constructor(_id,_quantity,_itemname,_category,_cost){
        this.id = _id;
        this.quantity = _quantity;
        this.itemName = _itemname;
        this.category = _category;
        this.cost = _cost;
    }
}