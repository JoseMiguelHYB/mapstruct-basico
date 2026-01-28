import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    // Convierte una entidad a un modelo de dominio
    User toDomain(UserEntity userEntity);

    // Convierte un modelo de dominio a una entidad
    UserEntity toEntity(User user);

    // MapStruct implementa estos métodos automáticamente
}
