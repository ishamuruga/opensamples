 export default class Item {
    cost;
    constructor(_id,_name,_quantity,_category,_cost) {
        this.id=_id;
        this.name = _name;
        this.quantity = _quantity;
        this.category = _category;
        this.cost = _cost;
    }
}