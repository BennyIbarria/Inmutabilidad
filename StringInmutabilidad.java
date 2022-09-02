public class StringInmutabilidad {
    public static void main(String[] args) {

        String curso="Aprendiendo Java";
        String alumno= "José Benito ibarria Topete";

        String resultado = curso.concat(alumno);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso==resultado);

        String resultado2 = curso.transform(c->{
            return c + " Con " + alumno;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        resultado.replace("a","A");
        System.out.println("resultado = " + resultado);

        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado3 = " + resultado3);

        //El objeto de la clase inicial No se modifica, se puede asignar a un nuevo objeto y ese objeto será una nueva instancia
        //con las caracteristicas que deseemos, Inmutabilidad
    }
}
