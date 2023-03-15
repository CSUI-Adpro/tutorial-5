package id.ac.ui.cs.advprog.tutorial5.service.medicine;

import id.ac.ui.cs.advprog.tutorial5.dto.MedicineRequest;
import id.ac.ui.cs.advprog.tutorial5.model.medicine.Medicine;
import id.ac.ui.cs.advprog.tutorial5.repository.MedicineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicineServiceImpl implements MedicineService {
    private final MedicineRepository medicineRepository;
    @Override
    public List<Medicine> findAll() {
        // TODO: Lengkapi kode berikut
        return null;
    }

    @Override
    public Medicine findById(Integer id) {
        // TODO: Lengkapi kode berikut (Pastikan Anda memanfaatkan Exceptions yang ada!)
        return null;
    }

    @Override
    public Medicine create(MedicineRequest request) {
        // TODO: Lengkapi kode berikut
        Medicine medicine = null;
        return medicineRepository.save(medicine);
    }

    @Override
    public Medicine update(Integer id, MedicineRequest request) {
        if (isMedicineDoesNotExist(id)) {
            // TODO: Lengkapi kode berikut (Pastikan Anda memanfaatkan Exceptions yang ada!)
            return null;
        }
        Medicine medicine = null;
        return this.medicineRepository.save(medicine);
    }

    @Override
    public void delete(Integer id) {
        // TODO: Lengkapi kode berikut (Pastikan Anda memanfaatkan Exceptions yang ada!)
    }

    private boolean isMedicineDoesNotExist(Integer id) {
        return medicineRepository.findById(id).isEmpty();
    }
}
