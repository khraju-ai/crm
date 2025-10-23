package in.crm.Lead.Service.repositories;

import in.crm.Lead.Service.entities.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Lead,String> {

}
