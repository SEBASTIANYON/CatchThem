package pe.edu.upc.catchthem.serviceinterfaces;

import pe.edu.upc.catchthem.entities.AntecedentePenal;

import java.util.List;

public interface IAntecedentePenalService {

    public void insertar(AntecedentePenal antecedentePenal);
    public List<AntecedentePenal> listar();
    public void eliminar(int idAntecedente);



}
