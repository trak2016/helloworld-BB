package pl.com.mmadry.helloworld.web.assembler;


/**
 * Interface for assemblers
 *
 * @param <T1> dbo objects type
 * @param <T2> dto objects type
 */
public interface Assembler<T1, T2> {

    /**
     * Converet dto objects to dbo objects
     *
     * @param dto
     * @return           dbo object
     */
    T1 assemblyToDbo(T2 dto);

    /**
     * Converet dbo objects to dto objects
     *
     * @param dbo
     * @return           dto object
     */
    T2 assemblyToDto(T1 dbo);

}
