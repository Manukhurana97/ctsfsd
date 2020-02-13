export interface Alpha {
    getFullname()
}

export class  Employee implements  Alpha{
    getFullname() {
        throw new Error("Method not implemented");
    }


}