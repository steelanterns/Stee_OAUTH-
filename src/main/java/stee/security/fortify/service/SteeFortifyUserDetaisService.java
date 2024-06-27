package stee.security.fortify.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import stee.security.fortify.entity.User;
import stee.security.fortify.model.SteeFortifyUserDetails;
import stee.security.fortify.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SteeFortifyUserDetaisService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        return user.map(SteeFortifyUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
