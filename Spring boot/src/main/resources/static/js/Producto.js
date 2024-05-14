export default class producto{
    constructor(codigoID, nombreProducto, cantidad, precio){
        this._codigoID = codigoID;
        this._nombreProducto = nombreProducto;
        this._cantidad = cantidad;
        this._precio = precio;
    }
    
    set codigoID(codigoID){
        this._codigoID = codigoID;
    }
    get codigoID(){
        return this._codigoID;
    }

    set nombreProducto(nombreProducto){
        this._nombreProducto = nombreProducto;
    }
    get nombreProducto(){
        return this._nombreProducto;
    }

    set cantidad(cantidad){
        this._cantidad = cantidad;
    }
    get cantidad(){
        return this._cantidad;
    }

    set precio(precio){
        this._precio = precio;
    }
    get precio(){
        return this._precio;
    }

}
